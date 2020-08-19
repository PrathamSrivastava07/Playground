#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int c;
  cin>>c;
  if(c%4==0 && c%100!=0)
  {
    cout<<"Vicky can celebrate his birthday.";
  }
  else if(c%400==0 )
  {
    cout<<"Vicky can celebrate his birthday.";
  }
else {
  cout<<"Vicky can't celebrate.";
}
    return 0;
}