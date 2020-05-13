#include<iostream>
using namespace std;
int gcd(int m,int n)
{
  if(n!=0)
    return gcd(n,m%n);
  else 
    return m;
}
int main()
{
  int m,n;
  cin>>m>>n;
  cout<<"G.C.D of "<<m<<" and "<<n<<" = "<<gcd(m,n);//Type your code here.
}