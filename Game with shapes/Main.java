#include<iostream>
#include<iostream>
using namespace std;
int main()
{
  int r,s,d;
  cin>>r>>s;
  d=2*r;
  if(d<=s)
  {
    cout<<"circle can be inside a square";
  }
  else 
  {
    cout<<"circle cannot be inside a square";
  }
}