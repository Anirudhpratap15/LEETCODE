class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int count = 1;
            for (int j = 0; j < sentence.length(); j++) {

                String temp = sentence;
                char x = temp.charAt(j);
                char space = ' ';
                if (x == ' ') {
                    count++;


                }
            }
            if (count > max) {
                max = count;
            }

        }

      return max;
        
    }
}