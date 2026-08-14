char* removeDuplicateLetters(char* s){
    int last[26]={0},used[26]={0};
    int n=strlen(s),top=0;
    char* ans=malloc((n+1)*sizeof(char));

    for(int i=0;i<n;i++)
        last[s[i]-'a']=i;

    for(int i=0;i<n;i++){
        int c=s[i]-'a';

        if(used[c])
            continue;

        while(top>0&&ans[top-1]>s[i]&&last[ans[top-1]-'a']>i){
            used[ans[top-1]-'a']=0;
            top--;
        }

        ans[top++]=s[i];
        used[c]=1;
    }

    ans[top]='\0';
    return ans;
}