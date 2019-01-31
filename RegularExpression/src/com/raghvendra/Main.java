package com.raghvendra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String str1 = "I am1 a2 string3. 11Yes I am.";
        System.out.println(str1);
        String str2 = str1.replaceAll("[^a-z0-9]", "");
        System.out.println(str2);
        String alphaNumeric = "123dddDfrewQef0uwtAa5sdetyu67:'";
        System.out.println(alphaNumeric.replaceAll(".","G")); // . is a Character class represents any character.
        // ^ - boundary matcher checks for the pattern in the beginning of the String
        System.out.println(alphaNumeric.replaceAll("^123ddd", "_THE_START"));  //^ checks for teh first occurrence of the sequence and replace it.
        String secondString = "123dddfrew123dddQasdetyu67:'";
        System.out.println(secondString.replaceAll("^123ddd","UU")); //will only replace the first occurrence of "123ddd", not the second one.
        //matches
        System.out.println(alphaNumeric.matches("^dddf")); //result - false // will return true, if the regex matches in the string, and it should be at the beginning.
        System.out.println(alphaNumeric.matches("^123d"));  //result- false //second point, entire string should match we cannot give a part in teh regex and expect it to be a match.
        System.out.println(alphaNumeric.matches("^123dddfrewQasdetyu67:'")); //result - true, here entire string is passed hence result is true.
        System.out.println(alphaNumeric.matches("123dddfrewQasdetyu67:'")); //result - true, here entire string is passed hence result is true.
        // $ - boundary matcher checks for the pattern in the end of the String
        System.out.println(alphaNumeric.replaceAll("67:'$","_THE_END"));
        // To Match set of letters in a String - we can put them in square brackets.
        System.out.println(alphaNumeric.replaceAll("[dew]","C")); //replaces all occurence of dew with 'C'
        //Replace the letters dew only if they are followed by either of te words in "ft"
        System.out.println(alphaNumeric.replaceAll("[dew][ft]","C")); // implies that all the combinations df/dt/ef/et/wf/wt will be replaced with'C'.
        System.out.println("Harry".replaceAll("[Hh]arry","harry")); //it will convert the lower or uppercase to the harry.
        //If we want to replace all the characters except few of them
        System.out.println(alphaNumeric.replaceAll("[^dy]","X"));
        //We can also pass range in regex
        System.out.println(alphaNumeric.replaceAll("[a-d0-2]","X")); //checks the range and replace all the chars with X which lies in the range
        //To include case-senstivity as well in the regex, there are two ways
        System.out.println(alphaNumeric.replaceAll("[a-dA-D0-2]","X"));  //First way by giving out range.
        System.out.println(alphaNumeric.replaceAll("(?i)[a-d0-2]","X"));  //Second, by prefixing with (?i), it supresess case sensitivity
        //Replace all digits with something
        System.out.println(alphaNumeric.replaceAll("[0-9]","X"));  //First way
        System.out.println(alphaNumeric.replaceAll("\\d","X"));  //Second way
        //replace all non-digits with something
        System.out.println(alphaNumeric.replaceAll("\\D","X"));
        //String has trim() method which removes whitespaces present in the beginning and the end of the string.
        //Now I want to remove all the whitespaces present anywhere in the String.
        String haswhiteSpaces = "I have blanks and\ta tab and a newline. \n";
        System.out.println(haswhiteSpaces);
        System.out.println(haswhiteSpaces.replaceAll("\\s",""));
        System.out.println(haswhiteSpaces.replaceAll("\t","X")); //replace tab characters with X
        System.out.println(haswhiteSpaces.replaceAll("\\S","X")); //replaces all non-white space characters with X
        //If we ant to replace all a-z, A-Z and 0-9 and Underscore with some words then use /w.
        // opposite effect by /W
        System.out.println(alphaNumeric.replaceAll("\\w","X"));
        System.out.println(alphaNumeric.replaceAll("\\W","X")); //opposite of \\w
        //To prefix and suffix words and matches words boundaries , it assumes words are sperated by whitespaces
        System.out.println(haswhiteSpaces.replaceAll("\\b", "X")); //useful for tagging a word at teh starta nd end of the word.
        System.out.println(haswhiteSpaces.replaceAll("\\B","X"));  //does the opposite of above.

        //Qunatifiers, String : 123dddDfrewQef0uwtAa5sdetyu67:'
        System.out.println(alphaNumeric.replaceAll("^123ddd", "_THE_START"));
        System.out.println(alphaNumeric.replaceAll("^123d{3}","_THE_START")); //length has been qunatified by numeral in curly braces
        System.out.println(alphaNumeric.replaceAll("^123d+","_THE_START")); //doesn't care how many d's are there(should be atleast one).just replace if teh string follows this pattern.
        System.out.println(alphaNumeric.replaceAll("^123d*","_THE_START")); //doesn't care how many d's are there(can be zero as well).just replace if teh string follows this pattern.
        System.out.println(alphaNumeric.replaceAll("^123d{2,5}","_THE_START")); //containing 2 to 5 d's.
        String secondAlphaNumeric = "123dddDfrewQef0uwthhiiiijAa5sdetyu67";
        System.out.println(secondAlphaNumeric.replaceAll("h+i*j","Y")); //will replace hhiiiij by Y , atleast one h , any number of i followed by j

        //Pattern matching
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>This is a sub heading</h2>");
        htmlText.append("<p>This is paragraph one.</p>");
        htmlText.append("<h1>Summary</h1>");
        htmlText.append("<h2>Sub - Heading</h2>");
        htmlText.append("<p>This is Summary Paragraph</p>");

//        String h2Pattern = ".*<h2>.*";
        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());  // Matcher.matches works in the same as matches in String works it checks for the entire String if same return true else false, Hence we added .* in regex

        matcher.reset(); //Resets the state of matcher
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurence "+ count + ": "+ matcher.start() + " to "+ matcher.end());
        }

        //using Group
//        String h2GroupPatten = "(<h2>.*</h2>)";  //Greedy Matcher using *  // will try to find the maxm substring containing the beginning and ending h2
        String h2GroupPatten = "(<h2>.*?</h2>)";  //Lazy Matcher using *?  // will stop at the first occurence
        Pattern groupPattern = Pattern.compile(h2GroupPatten);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        groupMatcher.reset();
        while (groupMatcher.find()){
            System.out.println("Occurence: "+ groupMatcher.group(1));
        }


        String h2TextGroup = "(<h2>)(.+?)(</h2>)";  //will return the text part between the enclosing tags, hence used group(2)
        Pattern h2TextPattern = Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
        System.out.println(h2TextMatcher.matches());

        h2TextMatcher.reset();
        while (h2TextMatcher.find()){
            System.out.println("Occurence: "+ h2TextMatcher.group(2));
        }

        //We can also use replaceAll and other matehods with Matcher Class- refer Oracle docs for more info.

        //Logical Operators
        //"abc -- > "a" and "b" and "c"  -- implicitly we were using AND operator
        //[Hh]arry
        System.out.println("Harry".replaceAll("[H|h]arry","Larry"));  // Output - Larry
        System.out.println("harry".replaceAll("[H|h]arry","Larry"));  // Output - Larry

        //[^abc]
        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";  //expects one charcter after t, so it will not return the position of last occurence of t.
//        String tNotVRegExp = "t(?!v)";  // will include the last t as well
        String tNotVRegExp = "t(?=v)";  // t will all followed by V, don't get confused by teh var name, just don't wanted to rewrite the code below line.
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()){
            System.out.println("Occurence "+count+" : "+tNotVMatcher.start()+" to "+ tNotVMatcher.end());
        }

        //US Phone number regex
        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "123456789";  //should not match
        String phone2 = "(123) 345-3333"; //should match
        String phone3 = "(123)456-789";  //should not match
        String phone4 = "(123) 456789";  //should not match

        System.out.println("Phone1 = "+ phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone2 = "+ phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone3 = "+ phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("Phone4 = "+ phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        //Checking for Visa Credit cards
        // ^4[0-9]{12}([0-9]{3})?$

        //Challenge -1
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        //Challenge -2
        //Match two Strings beginning with "I want a "
        String challenge2A =  "I want a bike.";
        String challenge2B = "I want a ball.";
        System.out.println(challenge2A.matches("I want a (bike|ball)."));
        System.out.println(challenge2B.matches("I want a (bike|ball)."));
    }
}