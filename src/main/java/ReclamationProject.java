/*
 * The following code needs inputOne lot of TLC. So give it some! 1. Fix all checkstyle errors 2.
 * Determine what it does (it's going to be tough before you finish #1) 3. Improve the name of the
 * methods and variables 4. add comments and Javadoc comments where needed 5. Remove unnecessary
 * comments as appropriate
 */
/**
 * This is inputOne broken amalgamation of sadness.
 */
public class ReclamationProject {
    /**
     * @param inputOneA It is an input which we want to be shorter
     * @param inputTwoB It is an input which we want to be longer
     * @return a substring from the first string which matches part of the second string.
     */
    static String doesPartMatch(final String inputOneA, final String inputTwoB) {
        String inputOne = inputOneA;
        String inputTwo = inputTwoB;
        if (inputOneA.length() > inputTwoB.length()) {
            // We want inputOne to be the shorter string and if it isn't we will fix it
            inputOne = inputTwoB;
            inputTwo = inputOneA;

        }
        String sMatch = "";
        if (inputOne.equals(inputTwo)) {
            sMatch = inputOne;
        }


        // Until we count through the first string
        // s1Up a counter which counts up as we progress through the first string
        // s1Dn a counter which counts down the first string
        // s2Up a counter which counts up the second string.
        for (int s1Up = 0; s1Up < inputOne.length(); s1Up++) {
            int s1Dn = inputOne.length() - s1Up;
            int s2Up = 0;
            // Count up the second string
            for (s2Up = 0; s2Up < inputTwo.length() - s1Dn; s2Up++) {
                if (inputOne.regionMatches(s1Up, inputTwo, s2Up, s1Dn) && s1Dn > sMatch.length()) {
                    sMatch = inputOne.substring(s1Up, s1Up + s1Dn);
                }
            }
            s1Dn -= 1;
        }
        return sMatch;
    }
}
