#include<iostream>
using namespace std;
int main()
{
  int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j==1)
        cout<<i;
      else
        cout<<"*"<<i;
    }
    cout<<"\n";
  }
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      if(j==1)
        cout<<i;
      else
        cout<<"*"<<i;
    }
    cout<<"\n";
  }
}