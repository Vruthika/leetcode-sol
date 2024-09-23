
char * toHex(int num){
    int tmp = 0;
    unsigned int mask = 0xf,cnt = 7;
    while(cnt>0 && !((num & (mask << (cnt*4))) >> (cnt*4))){cnt--;}
    char *ans = (char*)malloc(sizeof(char)*(cnt+2));
    ans[cnt+1] = '\0';
    for(int i = cnt; i>=0; i--){
        tmp = (num & (mask << (i*4))) >> (i*4);
        if(tmp>9){ans[cnt - i] = tmp % 10 + 'a';}
        else{ans[cnt - i] = tmp + '0';}
    }
    return ans;
}
