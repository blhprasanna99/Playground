#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k;
  cin>>n;
  k=n;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<k;
    }
    k++;
    cout<<"\n";
  }
  k--;
  for(i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<k;
    }
    k--;
    cout<<"\n";
  }
}