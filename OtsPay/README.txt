1. 本源码对OtsPay的SOA体系结构做了基本设计
2. 项目采用spring整合dubbo框架，将每个服务作为可以独立运行的模块
3. 项目采用zookeeper作为服务的注册中心，需要启动zookeeper服务
4. 项目模拟了从BankAdapter, FinanceLogModule, OrderModule, 到TradeModule, SecurityModule, 到BalanceManagerModule的服务调用过程
5. 通过对provider.xml的配置，spring将服务作为广播发布到网络。同样spring通过consumer.xml获取需要的服务
6. 由于时间关系，对项目来不及作部署处理，目前只能从每个模块的main方法启动服务注册到zookeeper