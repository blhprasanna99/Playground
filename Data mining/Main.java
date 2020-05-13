#include<iostream>
using namespace std;
int main()
{
  int d,es=0,os=0,n;
  cin>>n;
  while(n>0)
  {
    d=n%10;
    if(d%2==0)
    {
      es=es+d;
    }
    else
    {
      os=os+d;
    }
    n=n/10;
  }
  if(os==es)
  {
    cout<<"Yes";
  }
  else {
    cout<<"No";
  }//Type your code here.
}