class Solution {
    public String sortVowels(String s) {
        int n = s.length();

        StringBuilder vowel = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<n ; i++){

            char ch = s.charAt(i);

            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U'
            ){
                vowel.append(ch);
            }
        }

        char[] v = vowel.toString().toCharArray();

        Arrays.sort(v);      

        int j = 0;

       for(int i=0 ; i<n ; i++){

        char ch = s.charAt(i);

         if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U'
            ){
                sb.append(v[j++]);
                
            }
            else{
                sb.append(ch);
            }

       }
       return sb.toString();
    }
}