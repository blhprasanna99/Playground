#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i;
  float p;
  cin>>n;
  p=0.5;
  cout<<p<<' ';
  if(n>1)
  {
  for(i=0;i<n-1;i++)
  {
    p=p+pow(3,i);
    cout<<p<<' ';
  }
  }
}