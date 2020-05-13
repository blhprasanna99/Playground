#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  cin>>p>>t>>r;
  int s=(p*t*r)/100;
  cout<<s<<'\n';
  int s1=s+p;
  cout<<s1<<'\n';
  float x=s*0.02;
  cout<<x<<'\n';
  float y=s1-x;
  cout<<y;//Type your code here.
}