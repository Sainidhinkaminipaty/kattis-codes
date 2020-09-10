#include<bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<vector<int> > vvi;
typedef pair<int, int> pii;
typedef vector<pii> vii;
typedef map<int, int> mii;
#define LSOne(S) (S & (-S))

typedef long long LL;
#define INF 1000000000000LL

struct Edge {
  int a, b;
  LL cap, flow;
  Edge() {}
  Edge(int a, int b, LL cap): a(a), b(b), cap(cap), flow(0) {}
};

struct Dinic {
  int N;
  vector<Edge> E;
  vector<vector<int>> g;
  vector<int> d, pt;
  
  Dinic(int N): N(N), E(0), g(N), d(N), pt(N) {}

  void AddEdge(int a, int b, LL cap) {
    if (a != b) {
      E.emplace_back(Edge(a, b, cap));
      g[a].emplace_back(E.size() - 1);
      E.emplace_back(Edge(b, a, 0));
      g[b].emplace_back(E.size() - 1);
    }
  }

  bool BFS(int S, int T) {
    queue<int> q({S});
    fill(d.begin(), d.end(), N + 1);
    d[S] = 0;
    while(!q.empty()) {
      int a = q.front(); q.pop();
      if (a == T) break;
      for (int k: g[a]) {
        Edge &e = E[k];
        if (e.flow < e.cap && d[e.b] > d[e.a] + 1) {
          d[e.b] = d[e.a] + 1;
          q.emplace(e.b);
        }
      }
    }
    return d[T] != N + 1;
  }

  LL DFS(int a, int T, LL flow = -1) {
    if (a == T || flow == 0) return flow;
    for (int &i = pt[a]; i < g[a].size(); ++i) {
      Edge &e = E[g[a][i]];
      Edge &oe = E[g[a][i]^1];
      if (d[e.b] == d[e.a] + 1) {
        LL amt = e.cap - e.flow;
        if (flow != -1 && amt > flow) amt = flow;
        if (LL pushed = DFS(e.b, T, amt)) {
          e.flow += pushed;
          oe.flow -= pushed;
          return pushed;
        }
      }
    }
    return 0;
  }

  LL MaxFlow(int S, int T) {
    LL total = 0;
    while (BFS(S, T)) {
      fill(pt.begin(), pt.end(), 0);
      while (LL flow = DFS(S, T))
        total += flow;
    }
    return total;
  }
};

int r,c,rr,cc;
int dx[] = {0,1,0,-1};
int dy[] = {1,0,-1,0};

int idx(int x, int y) {
  return x * c + y;
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  cin >> r >> c;
  Dinic dinic(2 * r * c + 1);
  int source = 2 * r * c;
  for(int x = 0; x < r; x++) {
    for(int y = 0; y < c; y++) {
      if(x == 0 or y == 0 or x == r-1 or y == c-1) {
        dinic.AddEdge(source, idx(x, y), INF);
      }
      int t; cin >> t;
      dinic.AddEdge(idx(x,y), r*c+idx(x,y), t);
      for(int d = 0; d < 4; d++) {
        int nx = x + dx[d], ny = y + dy[d];
        if(nx < 0 or nx == r or ny < 0 or ny == c) continue;
        dinic.AddEdge(r*c+idx(x,y), idx(nx,ny), INF);
      }
    }
  }
  cin >> rr >> cc;
  cout << dinic.MaxFlow(source, r*c+idx(rr,cc)) << endl;
}

