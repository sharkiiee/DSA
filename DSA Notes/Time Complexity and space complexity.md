
For code :-

Whenever their is Division and no. of iteration of loop is depending on that number the time complexity will be $$O(log_{value}(N))$$
Example :- In the below example loop is depend on 10  so the time complexity will be $O(log_{10}(N))$


		while(n > 0){
			lastdigit = n % 10;
			count = count + 1;
				n = n / 10;
		}

if the  `n = n / 5` is responsible for the iteration then time complexity will be $O(log_{5}(N))$
