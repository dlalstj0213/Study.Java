> 사실 JDK에서 제공하는 Collections를 통해서 자료구조를 활용해봤다. 하지만 실제로 자료구조를 공부하고 구현해보기 위해서 새로운 패키지를 작성했다. (2021-07-01) <br/>
> 참고링크: [패스트캠퍼스 자바코스 강의_gitLab자료](https://gitlab.com/easyspubjava/javacoursework)

# 자료구조

### 자료구조란? (Data Structure)

- 메모리상 데이터들을 어떻게 관리해야 더 휴율적으로 관리 할 수 있는지, 그에 따른 로직, 알고리즘이 정의되어 있는 것들을 자료구조라 한다.

여러 자료 구조 중에서 구현하려는 프로그램에 맞는 최적의 자료구조를 활용해야 하므로 자료구조에 대한 이해가 중요함

## 자료구조 종류

## 선형 자료구조

한 줄로 자료를 관리하기

### 배열 (Array)

선형으로 자료를 관리, 정해진 크기의 메모리를 먼저 할당받아 사용하고, 자료의 물리적 위치와 논리적 위치가 같음

![배열](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/array.png)

- 배열은 자료와 자료 사이에 자료가 비어 있을 수 없다.
  - 즉, 어떠한 자료가 삭제되면 뒤에 있는 자료를 앞으로 당겨와야 한다.
  - 또는, 어떠한 자료를 추가하면 추가할 위치의 자료를 뒤로 밀어야한다.
- 배열은 어느 위치에 있는 자료를 조회 할 때 빠르다.
  - 논리적인 위치와 물리적인 위치가 동일하기 때문


### 연결 리스트 (LinkedList)

선형으로 자료를 관리, 자료가 추가될 때마다 메모리를 할당 받고, 자료는 링크로 연결됨. 자료의 물리적 위치와 논리적 위치가 다를 수 있음

리스트에 자료 추가하기

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/listadd.png)

리스트에서 자료 삭제하기

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/listdelete.png)

- Circle Line LinkedList : 맨 마지막의 노드가 가리킬 노드가 없을 시 맨 앞의 노드를 가리키는 구조
- Double LinkedList : 뒤의 노드가 앞에 노드를 알고 있는 구조

### 스택 (Stack)

가장 나중에 입력 된 자료가 가장 먼저 출력되는 자료 구조 (Last In First OUt)

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/stack.png)

### 큐 (Queue)

가장 먼저 입력 된 자료가 가장 먼저 출력되는 자료 구조 (First In First Out)

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/queue.png)

### 트리 (tree)

부모 노드와 자식 노드간의 연결로 이루어진 자료 구조

### 힙 (heap)

Priority queue를 구현 (우선 큐)

Max heap : 부모 노드는 자식 노드보다 항상 크거나 같은 값을 갖는 경우

Min heap : 부모 노드는 자식 노드보다 항상 작거나 같은 값을 갖는 경우

heap정렬에 활용 할 수 있음

### 이진 트리 (binary tree)

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/binary1.png)

### 이진 검색 트리 (binary search tree)

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/binary3.png)

    자료(key)의 중복을 허용하지 않음

    왼쪽 자식 노드는 부모 노드보다 작은 값, 오른쪽 자식 노드는 부모 노드보다 큰 값을 가짐

    자료를 검색에 걸리는 시간이 평균 log(n) 임

    inorder traversal 탐색을 하게 되면 자료가 정렬되어 출력됨 

예) [23, 10, 28, 15, 7, 22, 56] 순으로 자료를 넣을때 BST <br>

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/binary2.png)

jdk 클래스 : TreeSet, TreeMap (Tree로 시작되는 클래스는 정렬을 지원 함)

### 그래프 (Graph)

정점과 간선들의 유한 집합 G = (V,E)

정점(vertex) : 여러 특성을 가지는 객체, 노드(node)

간선(edge) : 이 객체들을 연결 관계를 나타냄. 링크(link)

간선은 방향성이 있는 경우와 없는 경우가 있음

그래프를 구현하는 방법 : 인접 행렬(adjacency matrix), 인접 리스트(adjacency list)

그래프를 탐색하는 방법 : BFS(bread first search), DFS(depth first search)

그래프의 예)

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/graph.png)

### 해싱 (Hashing)

자료를 검색하기 위한 자료 구조

검색을 위한 자료 구조

키(key)에 대한 자료를 검색하기 위한 사전(dictionary) 개념의 자료 구조

key는 유일하고 이에 대한 value를 쌍으로 저장

index = h(key) : 해시 함수가 key에 대한 인덱스를 반환해줌 해당 인덱스 위치에 자료를 

저장하거나 검색하게 됨

해시 함수에 의해 인덱스 연산이 산술적으로 가능 O(1)

저장되는 메모리 구조를 해시테이블이라 함

jdk 클래스 : HashMap, Properties

### 해시테이블

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/hash.png)

### 체이닝

![](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter5/5-01/img/hash2.png)