    class Solution {
        public int lengthOfLastWord(String s) {
    
    int c =0;
        for(int i= s.length()-1; i>=0; i--){

    if(s.charAt(i) != ' '){

    c++;

    }else if(c>0){
        break;
    }

        }
            return c;
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna