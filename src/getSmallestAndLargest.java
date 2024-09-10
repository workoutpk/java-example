public class getSmallestAndLargest {
        public static String getSmallestAndLargestString(String string, int k) {
                String smallest = "";
                String largest = "";

                String first = string.substring(0, k); // Initialize the first substring as the first k characters of the input
                String last = string.substring(0, k); // Initialize the last substring as the first k characters of the input
                for (int i = 1; i <= string.length() - k; i++) { // Loop through the input from index 1 to index input.length() - k
                        String sub = string.substring(i, i + k); // Get the substring of length k starting from index i
                        if (sub.compareTo(first) < 0) { // If the substring is lexicographically smaller than the first substring
                                first = sub; // Update the first substring as the current substring
                        }
                        if (sub.compareTo(last) > 0) { // If the substring is lexicographically larger than the last substring
                                last = sub;
                        }
                }
                smallest =first;
                largest=last;
                return smallest + "\n" + largest;
        }

        public static void main(String[] args) {
                String s= "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhs" +
                        "LFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
                System.out.println(getSmallestAndLargestString(s,30));
        }
}
