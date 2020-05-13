#include<iostream>
using namespace std;
int main()
{
  int s,e,i,t,j;
  cin>>s>>e;
  for(i=s;i<=e;i++)
  {
    t=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
      {
        t=t+j;
      }
    }
    if(t==i)
    {
      cout<<i<<" ";
    }
  }
}