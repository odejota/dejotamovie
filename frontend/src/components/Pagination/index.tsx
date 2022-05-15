import { ReactComponent as Arrow } from 'assets/img/Arrow.svg';
import { MoviePage } from 'types/movie';
import './styles.css';

type Props = {
  page: MoviePage;
  onChange: Function;
}

function Pagination({page, onChange} : Props) {
  
  return (
    <div className="djmovie-pagination-container">
      <div className="djmovie-pagination-box">
        <button className="djmovie-pagination-button" disabled={page.first} onClick={() => onChange(page.number - 1)}>
          <Arrow />
        </button>
        <p>{`${page.number + 1} de ${page.totalPages}`}</p>
        <button className="djmovie-pagination-button" disabled={page.last} onClick={() => onChange(page.number + 1)}>
          <Arrow className="djmovie-flip-horizontal" />
        </button>
      </div>
    </div>
  )
}

export default Pagination
