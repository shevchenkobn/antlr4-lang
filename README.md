```shell
cd ./grammar
antlr4 -o ../src/ua/nure/lnu2020/ofp_4dv507/bogdan ./OfpBogdan.g4 -long-messages
```

```shell
javac -d ./out/production/antlr4-lang/ ./src/ua/nure/lnu2020/ofp_4dv507/bogdan/OfpBogdan*.java
cd ./out/production/antlr4-lang/ua/nure/lnu2020/ofp_4dv507/bogdan/
grun OfpBogdan start -tree # doesn't work with package names
```