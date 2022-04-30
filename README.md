# FEBS-Cloud-Alibaba
FEBS-Cloud 使用 Spring Cloud Alibaba 构建的版本


mysql 8.0.29 连接注意事项, 可能报错
DB连接后加可解决 allowPublicKeyRetrieval=true
    
# 前端项目 https://github.com/febsteam/FEBS-Cloud-Web   

node 版本 v14.19.1

npm run download 的时候遇到一个问题导致 install 不成功
```
3694 error Error while executing:
3694 error /usr/bin/git ls-remote -h -t git://github.com/adobe-webplatform/eve.git
3694 error
3694 error fatal: 远程错误：
3694 error   The unauthenticated git protocol on port 9418 is no longer supported.
3694 error Please see https://github.blog/2021-09-01-improving-git-protocol-security-github/ for more information.
```
包依赖的过程中含有非 https 的 github 地址，就会导致这问题, 解决办法   
```shell
git config --global url."https://github.com/".insteadOf git://github.com/
```
再 install 还是有问题
```aidl
59010 verbose node v14.19.1
59011 verbose npm  v6.14.16
59012 error code ELIFECYCLE
59013 error errno 1
59014 error node-sass@4.14.1 postinstall: `node scripts/build.js`
59014 error Exit status 1
59015 error Failed at the node-sass@4.14.1 postinstall script.
59015 error This is probably not a problem with npm. There is likely additional logging output above.
```
尝试使用 `cnpm install` 执行成功
```aidl
╰─$ cnpm install
✔ Installed 50 packages
✔ Linked 177 latest versions
[1/1] scripts.install node-sass@^4.9.0 run "node scripts/install.js", root: "/home/stg/hub/FEBS-Cloud-Web/node_modules/_node-sass@4.14.1@node-sass"
Downloading binary from https://cdn.npmmirror.com/binaries/node-sass/v4.14.1/linux-x64-83_binding.node
Download complete
Binary saved to /home/stg/hub/FEBS-Cloud-Web/node_modules/_node-sass@4.14.1@node-sass/vendor/linux-x64-83/binding.node
Caching binary to /home/stg/.npminstall_tarball/node-sass/4.14.1/linux-x64-83_binding.node
[1/1] scripts.install node-sass@^4.9.0 finished in 739ms
[1/1] scripts.postinstall node-sass@^4.9.0 run "node scripts/build.js", root: "/home/stg/hub/FEBS-Cloud-Web/node_modules/_node-sass@4.14.1@node-sass"
Binary found at /home/stg/hub/FEBS-Cloud-Web/node_modules/_node-sass@4.14.1@node-sass/vendor/linux-x64-83/binding.node
Testing binary
Binary is fine
[1/1] scripts.postinstall node-sass@^4.9.0 finished in 206ms
✔ Run 1 scripts
deprecate node-sass@4.14.1 › request@^2.88.0 request has been deprecated, see https://github.com/request/request/issues/3142
deprecate node-sass@4.14.1 › request@2.88.2 › har-validator@~5.1.3 this library is no longer supported
deprecate node-sass@4.14.1 › request@2.88.2 › uuid@^3.3.2 Please upgrade  to version 7 or higher.  Older versions may use Math.random() in certain circumstances, which is known to be problematic.  See https://v8.dev/blog/math-random for details.
deprecate node-sass@4.14.1 › node-gyp@3.8.0 › tar@^2.0.0 This version of tar is no longer supported, and will not receive security updates. Please upgrade asap.
✔ All packages installed (196 packages installed from npm registry, used 2s(network 833ms), speed 0B/s, json 0(0B), tarball 0B, manifests cache hit 177, etag hit 177 / miss 0)
```