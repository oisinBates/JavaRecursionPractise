// Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside them.

// nestParen("(())") → true
// nestParen("((()))") → true
// nestParen("(((x))") → false

public boolean nestParen(String str) {
  int strLength = str.length();
  if(strLength<2){
    if(strLength==0){
      return true;
    }
    return false;
  }
  else if(str.charAt(0)=='(' && str.charAt(strLength-1)==')'){
    if(strLength==2){
      return true;
    }
    else{
      return nestParen(str.substring(1,strLength-1));
    }
  }
  else{
    return false;
  }
}
