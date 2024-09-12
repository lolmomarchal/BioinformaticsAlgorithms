#include <iostream>
#include <string>
#include <tuple>
#include <sstream>
#include <ranges>
#include <algorithm>
#include <numeric>

int PatternCount(std::string Text,
		 std::string Pattern){
  int pattern_length = Pattern.length();
  int text_length = Text.length()+1;
  int count = 0;
  for (int i =0; i<text_length; i++){ 
    std::string substring = Text.substr( i, pattern_length);
    if (substring == Pattern){
      count++;}
  }
  return count;
}
