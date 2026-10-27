# Atividade 1 - Git Flow na Prática (comandos do professor)

> Estes são comandos de terminal, não código Java. Execute-os num repositório seu.
> Pré-requisito: o repositório já tem as branches `main` e `develop` (e um remoto `origin`).

## 1. Criar e trabalhar em uma branch de feature
```bash
git checkout develop
git pull origin develop
git checkout -b feature/login
```

## 2. Simular commits
```bash
# Alterar arquivos
git add .
git commit -m "Implementa validação de senha"
```
Dica: `git status` e `git diff --staged` mostram o que vai entrar no commit.

## 3. Merge via Pull Request
```bash
git push origin feature/login
# Criar PR no GitHub para merge em develop
```

## Exercício: hotfix
```bash
git checkout main
git pull origin main
git checkout -b hotfix/header-null
# simular uma correção (editar um arquivo)
git add .
git commit -m "Corrige header nulo"
```

# Atividade 2 - Branch protection (feita na interface do GitHub)
Settings -> Branches -> Add rule. Exigir: status checks (build/tests) e approvals (2 revisores).
Teste: abra um PR com erro (ex.: um teste falhando) para ver a ação falhar.
