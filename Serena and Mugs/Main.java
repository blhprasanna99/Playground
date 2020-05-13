#include<iostream>
using namespace std;
int printresult(int *a,int n,int s)
{
  int i,f=0,t=0;
  for(i=0;i<n;i++)
  {
    t=t+a[i];
    if(t>s)
    {
      f=1;
      break;
    }
  }
  if(f==0)
    cout<<"YES";
  else 
    cout<<"NO";
    
}
int main()
{
  int n,s,i,a[20];
  cin>>n>>s;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  printresult(a,n,s);
  //Type your code here.
}