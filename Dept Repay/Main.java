#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  cin>>p;
  cin>>r;
  cin>>t;
  cout<<(p*r*t)/100<< endl;
  cout<<((p*r*t)/100)+p<< endl;
  cout<<((p*r*t)/100)*0.02<< endl;
  cout<<(((p*r*t)/100)+p)-(((p*r*t)/100)*0.02);
    return 0;
  
}