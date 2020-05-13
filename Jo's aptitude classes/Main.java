#include<iostream>
using namespace std;
int gcd(int a,int b,int c)
{
  int s=a,g;
  if(b<a || c<a)
  {
    if(b<a && b<c)
      s=b;
    else
      s=c;
  }
  while(1)
  {
    if(a%s==0 && b%s==0 && c%s==0)
    {
      g=s;
      break;
    }
    s--;
  }
  return g;
}
int main()
{
  int a,b,c,n;
  cin>>a>>b>>c>>n;
  if (gcd(a,b,c)==n)
    cout<<"Answer is correct.";
  else 
    cout<<"Answer is wrong.";
}