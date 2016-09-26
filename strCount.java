// Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.

// strCount("catcowcat", "cat") → 2
// strCount("catcowcat", "cow") → 1
// strCount("catcowcat", "dog") → 0

public int strCount(String str, String sub) {
  int subLength= sub.length();
  if(str.length()<subLength){
    return 0;
  }
  else{
    if(str.substring(0,subLength).equals(sub)){
      return 1 + strCount(str.substring(subLength,str.length()), sub);
    }
    else{
      return 0 + strCount(str.substring(1,str.length()), sub);
    }
  }
}
