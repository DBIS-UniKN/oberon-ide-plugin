// This is a generated file. Not intended for manual editing.
package kn.uni.dbis.oberon.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static kn.uni.dbis.oberon.lang.psi.OberonTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import kn.uni.dbis.oberon.lang.psi.*;

public class OberonTypeDeclarationsImpl extends ASTWrapperPsiElement implements OberonTypeDeclarations {

  public OberonTypeDeclarationsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OberonVisitor visitor) {
    visitor.visitTypeDeclarations(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OberonVisitor) accept((OberonVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<OberonIdent> getIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OberonIdent.class);
  }

  @Override
  @NotNull
  public List<OberonType> getTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, OberonType.class);
  }

}
