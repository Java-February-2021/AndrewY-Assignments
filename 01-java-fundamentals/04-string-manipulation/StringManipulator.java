// public class StringManipulator {
//     public void manipulator() {
//         String hello = "   Hello";
//         String world = "    World";
//         String helloWorld = hello.concat(world.trim());
//         System.out.println(helloWorld.trim());

//         String myCharacter = "Coding";
//         {
//             if (myCharacter.indexof() == -1) {
//                 System.out.println("null");
//             }

//         }
//         System.out.println(myCharacter.indexOf("o"));
//         // public Interger getIndexOrNull(String input, char o) {
//         // if(input.indexof == -1) {
//         // return null;
//         // }
//         // }
//         // Integer b = manipulator.getIndexOrNull("Hello World", letter);
//         // Integer c = manipulator.getIndexOrNull("Hi", letter);
//         // System.out.println(a); // 1
//         // System.out.println(b); // 4
//         // System.out.println(c); // null
//         // public Integer getIndexOrNull(String input, char c) {
//         // if(input.indexOf(c) == -1) {
//         // return null;
//         // }
//         // return input.indexOf(c);
//     }
//}
public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }

    public Integer getIndexOrNull(String input, char c) {
        if (input.indexOf(c) == -1) {
            return null;
        }
        return input.indexOf(c);
    }

    public Integer getIndexOrNull(String input, String sub) {
        if (input.indexOf(sub) == -1) {
            return null;
        }
        return input.indexOf(sub);
    }

    public String concatSubstring(String input, int a, int b, String replacement) {
        String substr = input.substring(a, b);
        return substr.concat(replacement);
    }
}
