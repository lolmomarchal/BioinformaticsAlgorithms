import numpy as np 
""" Code Challenge: Implement PatternCount
(reproduced below). 
Input: Strings Text and Pattern.
Output: Count(Text, Pattern). """

def pattern_count(text: str, pattern: str) -> int:
    count = 0
    pattern_len = len(pattern)
    text_len = len(text)
    for i in range(text_len+1):
        if text[i:i+ pattern_len] == pattern:
                count += 1
    return count

"""
Code Challenge: Solve the Frequent Words Problem.

Input: A string Text and an integer k.
Output: All most frequent k-mers in Text.
"""
def frequency_table(text: str, k: int):
    text_len = len(text) -k + 1
    kmer_counts = {}
    for i in range(text_len):
        kmer = text[i:i+k]
        if kmer in kmer_counts.keys():
            kmer_counts[kmer] +=1
        else:
            kmer_counts[kmer]  = 0
    return kmer_counts
        
def frequent_words(text: str, k: int) -> list[str]:
    frequent = set()
    kmer_counts = frequency_table(text, k)
    max_val = max(kmer_counts.values())
    for item in kmer_counts.keys():
        if kmer_counts[item] == max_val:
            frequent.add(item)
    return list(frequent)
def reverse complement(text:str, 
    
    
    

     
