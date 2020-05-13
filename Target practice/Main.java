#include<iostream>
using namespace std;
int main()
{
  int n,x,t=0,c=0;
  cin>>n;
  while(1)
  {
    cin>>x;
    t=t+x;
    c=c+1;
    if(t>=n)
    {
      break;
    }
  }
  cout<<"The number of turns is "<<c;
}