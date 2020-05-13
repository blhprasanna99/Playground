#include<iostream>
using namespace std;
int main()
{
  int b,c,d=0,a;
  cin>>b>>c;
  if(b==d || c==d )
  {
    if(b==d)
    {
      a=(100-c);
    }
    else
      a=(100-b);
  }
  else if(b>c)
  {
    a=(100-b)+c;
  }
  else
  {
    a=abs(b-c);
  }
  cout<<a;
  }