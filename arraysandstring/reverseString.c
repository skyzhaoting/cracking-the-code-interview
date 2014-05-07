void reverse(char *str)
{
	if(str == NULL)
		return;
	char *end = str;
	while(*end)
		end++;
	end--;
	while(str > end)
	{
		char temp = *str;
		*str++ = *end;
		*end-- = temp;
	}
}
