#include<iostream>
using namespace std;
int main()
{
 int s,m,n,w,c;
  cin >> s;
  cin >> m;
  cin >> n;
  w= (m*75) + (n*30);
  if(w>s) {
    c=1;
  }
  else {
    c=2;
  }
    switch(c) {
      case 1: cout<< "Boat will drow" ;
        break;
      case 2: cout << "Boat is stable";
        break;
       default :
        break;
    }
  return 0;
}