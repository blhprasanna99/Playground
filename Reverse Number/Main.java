#include <iostream>
int main() 
{
	int n,sum,digit;
    std::cin>>n;
    while(n>0) {
      digit=n%10;
      sum=sum*10+digit;
      n=n/10;
    }
  std::cout<<sum;
	return 0;
}