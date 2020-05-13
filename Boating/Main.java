#include<iostream>
using namespace std;
int main()
{
  int b,a,c,aw,cw;
  cin>>b>>a>>c;
  aw=(a*75);
  cw=(c*30);
  if((aw+cw)<=b)
 {
       cout<<"Boat is stable";
 }
else 
 {
       cout<<"Boat will drow";
 }
}