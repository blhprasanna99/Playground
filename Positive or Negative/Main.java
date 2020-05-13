#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  if(n>=0) {
    std::cout<<n<<" is a positive number.";
  }
  else {
    std::cout<<n<<" is a negative number.";
  }
}