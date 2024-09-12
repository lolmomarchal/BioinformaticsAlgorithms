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


     
