class Solution {
    public String smallestPalindrome(String s) {
        int len = s.length();
        int[] arr = new int[26];
        StringBuilder ans = new StringBuilder();
        if(len ==1){
            return s;
        }
        for(int i = 0 ; i < len ;i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i = 0 ; i < 26 ;i++){
            for(int j = 0; j < arr[i]/2 ;j++){
                ans.append((char)(i+'a'));
            }
        }
        StringBuilder ans2 = new StringBuilder(ans).reverse();
        StringBuilder mid= new StringBuilder();
        for(int i = 0; i< 26 ;i++){
            if(arr[i]%2!=0){
                mid.append((char)(i+'a'));
                break;
            }
        }
        return ans.toString() + mid.toString() + ans2.toString();
    }
    }
        
        
        // if(len % 2 !=0){
        //     StringBuilder first = new StringBuilder();
        //     for(int i = 0 ; i <26 ;i++){
        //         if(arr[i]>0){
        //             first.append((char)(i +'a'));
        //         }    
        //     }
        //     StringBuilder second = new StringBuilder(first).reverse();
        //     for(int i = 0 ; i <26 ;i++){
        //         if(arr[i]!=0){
        //             ans.append((char)(i+'a'));
        //         }  
        //     }
        //     return first.toString()+ans.toString()+second.toString();
            
        // }else{
        //     for(int i = 0 ; i <26 ;i++){
        //          if(arr[i]>0){
        //             ans.append((char)(i + 'a'));
        //         }
        //     }
        //     for(int i = 25 ; i >=0 ; i--){
        //          if(arr[i]>0){
        //             ans.append((char)(i + 'a'));
        //         }
        //     }
        // }
        // return ans.toString();
        
