package oxxy.kero.roiaculte.team7.worki

import oxxy.kero.roiaculte.team7.annotation.base.Either
import oxxy.kero.roiaculte.team7.annotation.base.Failure
import oxxy.kero.roiaculte.team7.annotation.base.None


interface ProductRepository {
    fun addProduct(int:UserId): Either<Failure.SubmitionFailure, Result>
    fun deleteProduct(none: None):Either<Failure.SubmitionFailure , None>
}