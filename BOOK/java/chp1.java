import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Please do not remove package imports because these are used by the autograder.

public class Main { // Please do not change this class declaration as this line is used by the autograder.
public static int MaxMap(Map<String, Integer> freq_map){
    int max = Integer.MIN_VALUE;
    for(int values:freq_map.values()){
        if(values >max){
            max = values;
        }
    }
    return max;
}
public static Map<String, Integer> FrequencyTable(String Text, int k){
    Map<String, Integer> freq_map = new HashMap<>();
    for(int i = 0; i < Text.length()-k+1; i++){
        String substring_kmer = Text.substring(i, i+k);
        if (freq_map.containsKey(substring_kmer)){
            freq_map.put(substring_kmer, freq_map.get(substring_kmer)+1);
        }
        else{
            freq_map.put(substring_kmer, 1);
        }
    }
    return freq_map;
}

// Insert your FrequentWords function here, along with any subroutines you need
public static List<String> FrequentWords(String Text, int k) {
    List<String> Patterns = new ArrayList<>();
    Map<String, Integer> freqMap = FrequencyTable(Text,k);
    int max = MaxMap(freqMap);
    for(String key: freqMap.keySet()){
        if(freqMap.get(key) == max){
            Patterns.add(key);
            
        }
    }
    return Patterns; 

}
import java.util.Scanner;

// Please do not remove package imports because these are used by the autograder.

public class Main { // Please do not change this class declaration as this line is used by the autograder.

// Insert your ReverseComplement function here, along with any subroutines you need
public static String ReverseComplement(String Pattern) {
   StringBuilder reverse = new StringBuilder();
   for(char i:Pattern.toCharArray()){
         if(i == 'T'){
            reverse.append("A");
             }
        else if(i == 'A'){
             reverse.append("T");}
        else if (i == 'G'){
              reverse.append("C");}
        else{
              reverse.append("G");}
   }
    
   return reverse.reverse().toString();

}
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// Please do not remove package imports because these are used by the autograder.

public class Main { // Please do not change this class declaration as this line is used by the autograder.

// Insert your PatternMatching function here, along with any subroutines you need
public static List<Integer> PatternMatching(String Pattern, String Genome) {
    List<Integer> index = new ArrayList<>();
    for(int i = 0; i < Genome.length()- Pattern.length() +1;i++){
        if(Genome.substring(i, i+ Pattern.length()).equals(Pattern)){
            index.add(i);
            
        }
    }
    return index;

}
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// Please do not remove package imports because these are used by the autograder.

public class Main { // Please do not change this class declaration as this line is used by the autograder.
public static Map<String, Integer> FrequencyTable(String Text, int k){
    Map<String, Integer> freq_map = new HashMap<>();
    for(int i = 0; i < Text.length()-k+1; i++){
        String substring_kmer = Text.substring(i, i+k);
        if (freq_map.containsKey(substring_kmer)){
            freq_map.put(substring_kmer, freq_map.get(substring_kmer)+1);
        }
        else{
            freq_map.put(substring_kmer, 1);
        }
    }
    return freq_map;
}

// Insert your FrequentWords function here, along with any subroutines you need

// Insert your FindClumps function here, along with any subroutines you need
public static List<String> FindClumps(String Genome, int k, int L, int t) {
    List<String> Patterns = new ArrayList<>();
    for( int i = 0; i < Genome.length()-L+1;i++){
        String window = Genome.substring(i, i+L);
        Map<String, Integer> freqMap = FrequencyTable(window, k);
        for(String key: freqMap.keySet()){
            if(freqMap.get(key) >= t && Patterns.contains(key) == false){
                Patterns.add(key);
            }
        }
        
    }
    return Patterns;

}

//Please do not provide a closing bracket for the Main class, as the autograder will handle this.
//Please do not provide a closing bracket for the Main class, as the autograder will handle this.
//Please do not provide a closing bracket for the Main class, as the autograder will handle this.
