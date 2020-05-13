#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  cout<<n<<'\n';
  while(n>1)
  {
    if(n%2==0)
    {
      n=n/2;
      c++;
      cout<<n<<'\n';
    }
    else {
      n=3*n+1;
      c++;
      cout<<n<<'\n';
    }
    if(n==1)
    {
      break;
    }
  }
  cout<<c;//Type your code here.
}