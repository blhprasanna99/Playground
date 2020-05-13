#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,e,req;
  cin>>m>>n>>req;
  e=pow(m,n);
  if(req<=e)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else 
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}