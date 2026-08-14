
char* removeDuplicateLetters(char* s){
    int count[26];
   int  visited[26];
    int n=strlen(s),top=-1;
    char* stack=malloc((n+1)*sizeof(char));

    for(int i=0;i<n;i++)
        count[s[i]-'a']++;

    for(int i=0;i<n;i++){
        char c=s[i];
        count[c-'a']--;
        if(visited[c-'a'])
        continue;
        while(top>=0&&stack[top]>c&&count[stack[top]-'a']>0){
            visited[stack[top]-'a']=0;
            top--;
        }
        stack[++top]=c;
        visited[c-'a']=1;
    }
    stack[top+1]='\0';
    return stack;
}