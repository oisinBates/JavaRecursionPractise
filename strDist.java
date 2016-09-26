// Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.

// strDist("catcowcat", "cat") → 9
// strDist("catcowcat", "cow") → 3
// strDist("cccatcowcatxx", "cat") → 9

public int strDist(String str, String sub) {
  int subLength = sub.length();
  int strLength = str.length();
  if(strLength< subLength){
    return 0;
  }
  if(str.substring(0,subLength).equals(sub)){
    if(str.substring(strLength-subLength,strLength).equals(sub)){
      return str.length();      
    }
    else{
      return strDist(str.substring(0,strLength-1), sub);
    }
  }
  else{
    return strDist(str.substring(1), sub);
  }
}
