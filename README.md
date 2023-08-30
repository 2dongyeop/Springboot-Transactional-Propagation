# Springboot-Transactional-Propagation



## Introduce
스프링의 `@Transactional` 애너테이션에서 제공하는 옵션인 `Propagation`에 대해 옵션별로 학습하며, 상황별로 롤백이 어떻게 동작하는지를 학습합니다.

<br/>

1. 모든 내용은 [벨로그](https://velog.io/@dongvelop/Springboot-%ED%8A%B8%EB%9E%9C%EC%9E%AD%EC%85%98-%EB%A1%A4%EB%B0%B1-%EA%B3%A0%EB%A0%A4%EB%8A%94-%ED%95%98%EA%B3%A0-%EC%9E%88%EB%82%98)에 함께 정리해놓았으니 함께 보시길 바랍니다.
2. 벨로그에 나오는 모든 단계별 롤백 확인 코드는 [히스토리](https://github.com/2dongyeop/Springboot-Transactional-Propagation/commits/main)에서 확인하실 수 있습니다.

<br/>

## QuickStart
1. Git repository clone
    ```shell
    git clone [repository link]
    ```

2. Application Build & Start

3. root/test.http 실행
    (포스트맨으로 직접 확인하셔도 가능하나, 편의를 위해 만들었습니다.)