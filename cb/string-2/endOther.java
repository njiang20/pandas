public boolean endOther(String a, String b) {
  if(a.length() < b.length()) {
    String x = a;
    a = b.toLowerCase();
    b = x.toLowerCase();
  }
  
  return a.substring(a.length() - b.length()).equals(b);
}
