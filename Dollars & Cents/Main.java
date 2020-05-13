#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,td,tc,temp;
  cin>>d1>>c1>>d2>>c2;
  tc=(c1+c2)%100;
  temp=(c1+c2)/100;
  td=d1+d2+temp;
  cout<<td<<'\n'<<tc;//Type your code here.
}