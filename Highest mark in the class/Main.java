#include<iostream>
using namespace std;
int main()
{
  int a[20],i,m,n;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  m=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>m)
      m=a[i];
  }
  cout<<m;
}