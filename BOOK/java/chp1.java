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
